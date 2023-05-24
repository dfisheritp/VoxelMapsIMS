package dev.xplatform.voxel.model.shipping;

import java.security.InvalidParameterException;
import java.util.Locale;
import java.util.Objects;

public class PostalCode
{
    private final LocalePostalCodeFormatter postalCodeFormatter;
    private final String postalCode;

    private PostalCode()
    {
        this.postalCode = "";
        this.postalCodeFormatter = LocalePostalCodeFormatter.getByCountryCode(Locale.getDefault().getCountry());
    }

    public PostalCode(final Locale locale)
    {
        this.postalCode = "";
        this.postalCodeFormatter = LocalePostalCodeFormatter.getByCountryCode(locale);
    }

    public PostalCode(final String code)
    {
        this(code, Locale.getDefault());
    }

    public PostalCode(final String postalCode, final Locale locale)
    {
        this.postalCodeFormatter = LocalePostalCodeFormatter.getByCountryCode(locale.getCountry());
        if (postalCode.matches(postalCodeFormatter.getZipCodePattern().toString()))
        {
            this.postalCode = postalCode;
        }
        else
        {
            String msg = String.format("postalCode must match format %s", postalCodeFormatter.getZipCodePattern().toString());
            throw new InvalidParameterException(msg);
        }
    }

    public final String getPostalCode()
    {
        return this.postalCode;
    }

    public final boolean isRequired()
    {
        return this.postalCodeFormatter.isRequired();
    }

    public String toString()
    {
        if (this.postalCode == null)
        {
            return "";
        }
        return isRequired() ? this.postalCode : "";
    }

    public int hashCode()
    {
        int hash = 0;
        for (char c : this.postalCode.toCharArray()) {
            int charValue = (int) c;
            hash ^= ((hash << 5) + (hash >> 2) + ((1 - ((charValue - ' ') >> 31)) * (1 - ((charValue - '-') >> 31)) * charValue));
        }
        hash ^= Objects.hashCode(postalCodeFormatter);
        return hash;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof PostalCode))
        {
            return false;
        }
        PostalCode other = (PostalCode) obj;
        return Objects.equals(this.postalCode, other.postalCode)
                && Objects.equals(this.postalCodeFormatter, other.postalCodeFormatter);

    }
}
