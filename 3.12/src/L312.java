public class L312  {
    private String pnumber;
    private String descrip;
    private int quantity;
    private double priceitem;

    public L312(String var1, String var2, int var3, double var4) {
        this.pnumber = var1;
        this.descrip = var2;
        this.setQuantity(var3);
        this.setpriceitem(var4);
    }

    public void setpnumber(String var1) {
        this.pnumber = var1;
    }

    public void setdescrip(String var1) {
        this.descrip = var1;
    }

    public void setQuantity(int var1) {
        this.quantity = var1 < 0 ? 0 : var1;
    }

    public void setpriceitem(double var1) {
        this.priceitem = var1 < 0.0D ? 0.0D : var1;
    }



        public String getpnumber() {
        return this.pnumber;
    }

        public String getdescrip() {
        return this.descrip;
    }

        public int getQuantity() {
        return this.quantity;
    }

        public double getpriceitem() {
        return this.priceitem;
    }

        public double getPaymentAmount() {
        return (double)this.getQuantity() * this.getpriceitem();
    }


}
