class Program {

    static void Main(string[] args) {

        IFootballFactory germany = new BundesLigaFactory();
        IFootballFactory spain = new LaLigaFactory();
        IFootballFactory italy = new SerieAFactory();
        FootballWorld footballWorld = new FootballWorld(spain);
        Console.WriteLine(footballWorld.GetFootballTeamColor());
        Console.WriteLine(footballWorld.GetTopScorer());
        Console.ReadLine();
    }
}