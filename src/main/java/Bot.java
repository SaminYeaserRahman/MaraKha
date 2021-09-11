import Music.*;
import commands.*;
import events.Reply;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {

    public static String token = "ODg1Mzg4MjczMTYwMTkyMDIy.YTmUFg.sXxG46sdzUIT5g23A_UTkqPDWHc";
    public static JDA jda;
    public static void main(String[] args) throws Exception{
        jda = JDABuilder.createDefault(token).build();

        jda.addEventListener(new Reply());
        jda.addEventListener(new Calculate());
        jda.addEventListener(new Invite());
        jda.addEventListener(new Kick());
        jda.addEventListener(new Ping());
        jda.addEventListener(new Memes());
        jda.addEventListener(new UserCommand());

        jda.addEventListener(new JoinCommand());
        jda.addEventListener(new PlayCommand());
        jda.addEventListener(new DeleteCommand());
        jda.addEventListener(new SkipCommand());
        jda.addEventListener(new LeaveCommand());
        jda.addEventListener(new QueueCommand());
    }
}
