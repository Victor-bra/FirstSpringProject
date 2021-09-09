package arrmod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "aplicationContext.xml");

        Music music = context.getBean("musicBean", Music.class);

        MusicPalyer musicPalyer = new MusicPalyer(music);
        musicPalyer.playMusic();
        context.close();
    }
}
