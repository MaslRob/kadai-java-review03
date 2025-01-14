package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam swallows = new BaseBallTeam("東京ヤクルトスワローズ",80,59,4);
        BaseBallTeam baystars = new BaseBallTeam("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam tigers = new BaseBallTeam("阪神タイガース",68,71,4);
        BaseBallTeam giants = new BaseBallTeam("読売ジャイアンツ",68,72,3);
        BaseBallTeam carp = new BaseBallTeam("広島東洋カープ",66,74,3);
        BaseBallTeam dragons = new BaseBallTeam("中日ドラゴンズ",66,75,2);

        double rate = swallows.getRate();
        swallows.report(rate);

        rate = baystars.getRate();
        baystars.report(rate);

        rate = tigers.getRate();
        tigers.report(rate);

        rate = giants.getRate();
        giants.report(rate);

        rate = carp.getRate();
        carp.report(rate);

        rate = dragons.getRate();
        dragons.report(rate);
    }

}
