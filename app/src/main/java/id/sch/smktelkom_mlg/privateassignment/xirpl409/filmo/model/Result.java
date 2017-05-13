package id.sch.smktelkom_mlg.privateassignment.xirpl409.filmo.model;

import java.util.List;

/**
 * Created by hyuam on 18/04/2017.
 */

public class Result {
    //            "id": "abc-news-au",
    //            "name": "ABC News (AU)",
    //            "description": "Australia's most trusted source of local, national and world news. Comprehensive, independent, in-depth analysis, the latest business, sport, weather and more.",
    //            "url": "http://www.abc.net.au/news",
    //            "category": "general",
    //            "language": "en",
    //            "country": "au",
    //            "urlsToLogos": {
    //                "small": "",
    //                "medium": "",
    //                "large": ""
    //            },
    //            "sortBysAvailable": ["top"]
    
    public String poster_path;
    public int id;
    public Boolean adult;
    public String overview;
    public String release_date;
    public String original_language;
    public String title;
    public String backdrop_path;
    public Double popularity;
    public int vote_count;
    public Boolean video;
    public Double vote_average;
    //public List<String> urlsToLogos;
    public List<String> sortBysAvailable;
    public int color;
    
}
