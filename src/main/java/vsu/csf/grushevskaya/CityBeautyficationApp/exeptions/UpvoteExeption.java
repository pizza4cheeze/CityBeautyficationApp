package vsu.csf.grushevskaya.CityBeautyficationApp.exeptions;

public class UpvoteExeption extends Exception {
    private Integer problemId;
    private Integer userId;

    public UpvoteExeption(String message, Integer problemId, Integer userId) {
        super(message);
        this.problemId = problemId;
        this.userId = userId;
    }

    public UpvoteExeption() {
    }
}
