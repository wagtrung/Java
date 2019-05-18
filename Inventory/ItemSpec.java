/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package items;

/**
 *
 * @author WagTrung
 */
public class ItemSpec {

    private String description;
    private String manufacturer;
    private String material;
    private String origin;

    public ItemSpec(String des, String man, String mat,String or) {
        description = des;
        manufacturer = man;
        material = mat;
        origin=or;

    }

    public String getOrigin() {
        return origin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public enum Manufacturer {

        vinamilk, thainguyen, highland;

        @Override
        public String toString() {

            switch (this) {

                case vinamilk:
                    return "Vinamilk";

                case thainguyen:
                    return "ThaiNguyen";

                case highland:
                    return "HighLand";

                default:
                    throw new AssertionError("Unknown operations " + this);

            }

        }

    }

    public enum Material {

        // Write some of the brand names here
        Milk, Soy, Leaf;

        @Override
        public String toString() {

            switch (this) {

                case Milk:
                    return "milk";

                case Soy:
                    return "soy";

                case Leaf:
                    return "leaf";

                default:
                    throw new AssertionError("Unknown operations " + this);

            }

        }

    }

    @Override
    public String toString() {
        return "\nmanuafaceture " + manufacturer.toString() + "\nmaterial " + material.toString() + "\ndescription " + description + "\norigin "+origin+"\n---------------------";

    }

}
