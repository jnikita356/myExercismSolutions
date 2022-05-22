
class BirdWatcher {
    private int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        birdsPerDay=new int[7];
        birdsPerDay[0]=0;
        birdsPerDay[1]=2;
        birdsPerDay[2]=5;
        birdsPerDay[3]=3;
        birdsPerDay[4]=7;
        birdsPerDay[5]=8;
        birdsPerDay[6]=4;
        return birdsPerDay;
    }

    public int getToday() {
        if(birdsPerDay.length==0){
            return 0;
        }
        return(birdsPerDay[birdsPerDay.length-1]);
    }

    public void incrementTodaysCount() {
        birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]==0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sums=0;
        for(int i=0;i<numberOfDays && i<birdsPerDay.length;i++){
            sums=sums+birdsPerDay[i];
        }
        return sums;
    }

    public int getBusyDays() {
        int count=0;
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]>=5){
                count++;
            }
        }
        return count;
    }
}
