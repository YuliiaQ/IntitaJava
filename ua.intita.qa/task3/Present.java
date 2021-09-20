package task3;

public class Present {
    private Sweet[] sweets;

    public Present (Sweet[] sweets){
        this.sweets=sweets;
    }
    double weightOfPresent=0;
    public void presentWeight (){
        for (Sweet sweet : sweets){
            weightOfPresent+=sweet.weight;
        }
        System.out.println("Weight of the present: "+weightOfPresent);
    }
    public void findSweet (double minSugar, double maxSugar){
        for (Sweet sweet : sweets){
            if (sweet.getSugarValue()>=minSugar & sweet.getSugarValue()<=maxSugar){
                System.out.println("Diapason: "+sweet);
            }
        }
    }
}
