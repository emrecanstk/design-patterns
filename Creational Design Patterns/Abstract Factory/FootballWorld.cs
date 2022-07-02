public class FootballWorld {
    
    private readonly ITeam _team;

        public FootballWorld(IFootballFactory factory) {
            _team = factory.CreateTeam();
        }

        public string GetFootballTeamColor() {
            return _team.GetTeamColor();
        }
}
