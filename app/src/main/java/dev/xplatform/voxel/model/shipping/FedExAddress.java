package dev.xplatform.voxel.model.shipping;

public class FedExAddress extends Address
{
    boolean isResidential;

    protected FedExAddress()
    {
        super();
    }

    /**
     * Returns the residential state of the address.
     *
     * @return the residential state of the address.
     */
    public boolean getIsResident() {
        return isResidential;
    }

    /**
     * Sets the residential state of the address
     *
     * @param isResidential The residential state to set.
     */
    public void setIsResidential(boolean isResidential)
    {
        this.isResidential = isResidential;
    }
}
