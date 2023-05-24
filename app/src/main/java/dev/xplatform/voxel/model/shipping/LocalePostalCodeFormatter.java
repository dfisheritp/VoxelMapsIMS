package dev.xplatform.voxel.model.shipping;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

public enum LocalePostalCodeFormatter
{
    US("([0-9]{5})(-[0-9]{4})?", true),
    CA("[A-Za-z]\\d[A-Za-z] \\d[A-Za-z]\\d", true),
    GB("[A-Za-z]{1,2}\\d[A-Za-z\\d]?\\s?\\d[A-Za-z]{2}", false),
    AR("[A-Za-z]\\d{4}[A-Za-z]{3}", true),
    AU("\\d{4}", false),
    AT("\\d{4}", true),
    BE("\\d{4}", true),
    BR("\\d{5}(-\\d{3})?", true),
    BG("\\d{4}", true),
    KH("\\d{5}", true),
    CL("\\d{7}|\\d{3}-\\d{4}", false),
    CO("\\d{6}", false),
    HR("\\d{5}", true),
    CR("\\d{5}(-\\d{4})?", true),
    CZ("\\d{3} \\d{2}|\\d{5}", false),
    DK("\\d{4}", true),
    DO("\\d{5}", true),
    EC("\\d{6}", true),
    EG("\\d{5}", true),
    EE("\\d{5}", true),
    FI("\\d{5}", true),
    FR("\\d{5}", false),
    DE("\\d{5}", false),
    GR("\\d{2} \\d{2}", false),
    GT("\\d{5}", false),
    HU("\\d{4}", true),
    IN("\\d{6}|\\d{3} \\d{3}", true),
    ID("\\d{5}", true),
    IE("[A-Za-z]\\d{2}\\s?[A-Za-z\\d]{4}", false),
    IT("\\d{5}", true),
    JO("\\d{5}", true),
    KW("\\d{5}", true),
    LV("\\d{4}", true),
    LT("\\d{5}", true),
    LU("\\d{4}", true),
    MY("\\d{5}", true),
    MT("[A-Za-z]{3}\\s?\\d{4}", true),
    MX("\\d{5}", true),
    ME("\\d{5}", true),
    NL("\\d{4}\\s?[A-Za-z]{2}", false),
    NZ("\\d{4}", true),
    NO("\\d{4}", true),
    OM("\\d{3}", true),
    PK("\\d{5}", true),
    PY("\\d{4}", true),
    PE("\\d{5}", false),
    PH("\\d{4}", true),
    PL("\\d{2}-\\d{3}", true),
    PT("\\d{4}-\\d{3}", true),
    RO("\\d{6}", true),
    RU("\\d{6}", true),
    SA("\\d{5}-\\d{4}", true),
    RS("\\d{5}", true),
    SG("\\d{6}", true),
    SK("\\d{3} \\d{2}|\\d{5}", true),
    SI("\\d{4}", true),
    ZA("\\d{4}", false),
    ES("\\d{5}", true),
    SE("\\d{3}-\\d{2}|\\d{3} \\d{2}|\\d{5}", false),
    CH("\\d{4}", true),
    TW("\\d{3}|\\d{6}|\\d{3}-\\d{3}", false),
    TZ("\\d{5}", false),
    TH("\\d{5}", true),
    TN("\\d{4}", true),
    TR("\\d{5}", true),
    UA("\\d{5}", true),
    UY("\\d{5}", true),
    VE("\\d{4}|\\d{4}-[A-Za-z]", true),
    VN("\\d{6}", true);

    private static final Map<String, LocalePostalCodeFormatter> BY_COUNTRY_CODE = new HashMap<>();

    static {
        for (LocalePostalCodeFormatter formatter : values()) {
            BY_COUNTRY_CODE.put(formatter.name(), formatter);
        }
    }

    private final Pattern zipCodePattern;
    private final boolean required;

    LocalePostalCodeFormatter(String zipCodePattern, boolean required) {
        this.zipCodePattern = Pattern.compile(zipCodePattern);
        this.required = required;
    }

    public Pattern getZipCodePattern() {
        return zipCodePattern;
    }

    public static LocalePostalCodeFormatter getByCountryCode(String countryCode) {
        return BY_COUNTRY_CODE.get(countryCode);
    }

    public static LocalePostalCodeFormatter getByCountryCode(Locale locale)
    {
        return BY_COUNTRY_CODE.get(locale.getCountry());
    }

    public boolean isRequired()
    {
        return required;
    }
}
