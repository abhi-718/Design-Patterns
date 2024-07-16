
/**
 * This Interface is the subject interface which will be used to notify all the Observers once state of Other object changes
 *
 */


public interface Subject {

    void registerObserver(Observer1 observer);


    void removeObserver(Observer1 observer);

    void notifyObserver();

}
