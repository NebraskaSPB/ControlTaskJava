public class Games {
    private int gamesId;
    private String toyName;
    private int quantity;
    private int dropRate;

    public Games(int id, String title, int quantity, int rate) {
        this.gamesId = id;
        this.toyName = title;
        this.quantity = quantity;
        this.dropRate = rate;
    }

    public void ChangeRate(int rate) {
        this.dropRate = rate;
    }

    public void ChangeQuantity(String operation, int quantity) {
        switch (operation) {
            case "add":
                this.quantity += quantity;
                break;
            case "remove":
                this.quantity -= quantity;
                break;
        }
    }

    public void ChangeQuantity(String operation) {
        this.ChangeQuantity(operation, 1);
    }

    public int GetToyId() {
        return this.gamesId;
    }

    public int GetToyDropRate() {
        return this.dropRate;
    }

    public String GetToyTitle() {
        return this.toyName;
    }

    public int GetToyQuantity() {
        return this.quantity;
    }
}
