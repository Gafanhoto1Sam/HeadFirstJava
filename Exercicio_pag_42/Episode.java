class EpisodeTestDrive 
{
  public static void main(String[] args)
 {
   Episode episode = new Episode();
   episode.SeriesNumber = 4;
   episode.play();
   episode.SkipIntro();
 }
}
class Episode
{
  int SeriesNumber;
  int episodeNumber;
   
  void SkipIntro()
  {
   System.out.println("Skipping intro...");
  }
  void SkipToNext()
  {
   System.out.println("Loading next episode...");
  }
  void play()
  {
    System.out.println("Loading play...");
  }
}
   
