package service;

import model.Screen;
import model.Show;

public interface ScreenService {
    Show searchShow(String showName);
    void showShows();
    // Other screen-related operations as needed
}

