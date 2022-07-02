public class BundesLigaFactory : IFootballFactory {

    public ITeam CreateTeam() {
        return new BorussiaDotmund();
    }

    public IPlayer CreatePlayer() {
        return new BundesligaPlayer();
    }
    
}