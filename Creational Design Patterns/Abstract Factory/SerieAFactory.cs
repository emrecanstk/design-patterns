public class SerieAFactory : IFootballFactory {

    public ITeam CreateTeam() {
        return new Juventus();
    }

    public IPlayer CreatePlayer() {
        return new SerieAPlayer();
    }
}