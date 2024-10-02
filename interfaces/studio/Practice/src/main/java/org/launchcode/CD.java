package main.java.org.launchcode;

public class CD extends Data implements OpticalDisc {

    private boolean isMusicCD;

    public CD(String name, boolean isMusicCD) {
        super(name, "", 800, 700);
        this.isMusicCD = isMusicCD;
        setDiscType(isMusicCD ? "music CD" : "CD-RW");
    }

    public CD(String name) {
        this(name, false);
    }

    public void setMusicCD(boolean musicCD) {
        isMusicCD = musicCD;
    }

    public boolean isMusicCD() {
        return isMusicCD;
    }

    @Override
    void spinDisc(){
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void writeFile() {


    }

    @Override
    public void removeFile() {

    }

    @Override
    public void reformatDisc() {

    }

    @Override
    public void runFile() {

    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
