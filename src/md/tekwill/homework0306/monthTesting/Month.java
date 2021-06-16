package md.tekwill.homework0306.monthTesting;

public class Month {
    private int monthNumber;
    String month;

    public Month(){
        //monthNumber=1;
        monthNumber=getMonthNumber();
        month=getMonthName();
    }

    public Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public Month(String month) {
        this.month = month;

        if (month.equalsIgnoreCase("January")) {
            monthNumber = 1;
        } else if (month.equalsIgnoreCase("February")) {
            monthNumber = 2;
        } else if (month.equalsIgnoreCase("March")) {
            monthNumber = 3;
        } else if (month.equalsIgnoreCase("April")) {
            monthNumber = 4;
        } else if (month.equalsIgnoreCase("May")) {
            monthNumber = 5;
        } else if (month.equalsIgnoreCase("June")) {
            monthNumber = 6;
        } else if (month.equalsIgnoreCase("July")) {
            monthNumber = 7;
        } else if (month.equalsIgnoreCase("August")) {
            monthNumber = 8;
        } else if (month.equalsIgnoreCase("September")) {
            monthNumber = 9;
        } else if (month.equalsIgnoreCase("October")) {
            monthNumber = 10;
        } else if (month.equalsIgnoreCase("November")) {
            monthNumber = 11;
        } else if (month.equalsIgnoreCase("December")) {
            monthNumber = 12;
        }
    }

    public void setMonthNumber(int monthNumber) throws InvalidMonthNumberException {
        if (monthNumber < 1 || monthNumber > 12) {
            // monthNumber = 1;
            throw new InvalidMonthNumberException("Invalid month number!");
        } else {
            this.monthNumber = monthNumber;
        }
    }

    public void setMonthName(String month) throws InvalidMonthNameException {
        if (!(month.equalsIgnoreCase("January")
                || month.equalsIgnoreCase("February")
                || month.equalsIgnoreCase("March")
                || month.equalsIgnoreCase("April")
                || month.equalsIgnoreCase("May")
                || month.equalsIgnoreCase("June")
                || month.equalsIgnoreCase("July")
                || month.equalsIgnoreCase("August")
                || month.equalsIgnoreCase("September")
                || month.equalsIgnoreCase("October")
                || month.equalsIgnoreCase("November")
                || month.equalsIgnoreCase("December"))) {
            throw new InvalidMonthNameException("Invalid month name! ");
        } else {
            this.month = month;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        switch (monthNumber) {
            case 1: month="January"; break;

            case 2:
              month= "February"; break;
            case 3:
               month= "March"; break;
            case 4:
                month= "April"; break;
            case 5:
               month="May"; break;
            case 6:
               month= "June"; break;
            case 7:
              month= "July"; break;
            case 8:
              month="August"; break;
            case 9:
             month= "September"; break;
            case 10:
                month= "October"; break;
            case 11:
               month= "November"; break;
            case 12:
              month= "December"; break;

        }
return month;
    }

    @Override
    public String toString() {
        return getMonthName();
    }

    public boolean equals(Month month) {
        if (month.getMonthNumber() == this.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean greaterThan(Month month) {
        if (month.getMonthNumber() > this.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean lessThan(Month month) {
        if (month.getMonthNumber() < this.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }


}
