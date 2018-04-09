public class Printer {
    private int pages;
    private int toner;
    private int maxPages;
    private int maxToner;

    public Printer(int pages,int toner){
        this.maxPages = pages;
        this.maxToner = toner;
        this.pages = maxPages;
        this.toner = maxToner;
    }

    public int pagesLeft(){
        return this.pages;
    }

    public int tonerLeft(){
        return this.toner;
    }

    public int print(int numberOfSheets, int copies){
       int printValue = numberOfSheets * copies;
       if(printValue<=this.pages && this.toner>= 1){
           this.toner -= 1;
           return printValue;
       } else {
           return 0;
       }
    }

    public void refillPaper(){
        this.pages = this.maxPages;
    }

    public void refillToner(){
        this.toner = this.maxToner;
    }

    public void tonerLeak(){
        this.toner = 0;
    }

}
