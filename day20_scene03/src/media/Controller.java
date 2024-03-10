package media;

import java.io.File;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controller implements Initializable{
	@FXML public ListView<String> listView;
	@FXML public MediaView mediaView;
	@FXML public Button btnPlay, btnPause, btnStop;
	
	MediaPlayer mediaPlay;
	ObservableList<String> mediaList;
	String path;
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		mediaList = FXCollections.observableArrayList();
		path = Paths.get("").toAbsolutePath().toString();
		path += "/src/resources/media";
		File file = new File(path);
		for (String s : file.list()){
			mediaList.add(s);
		}
		listView.setItems(mediaList);
		setMedia();
	}
	private void setMedia() {
		listView.getSelectionModel().selectedIndexProperty().addListener(
				(obj, preValue, newValue) -> {
//					path = path + "/" + mediaList.get((Integer)newValue);
					File file = new File(path + "/" + mediaList.get((int)newValue));
					System.out.println("path : " + path);
					System.out.println(file.toURI().toString());
					Media media = new Media(file.toURI().toString());
					mediaPlay = new MediaPlayer(media);
					mediaView.setMediaPlayer(mediaPlay);
					
					mediaPlay.setOnReady(() -> {
						btnPlay.setDisable(false); // 활성화
						btnPause.setDisable(true); // 비활성화
						btnStop.setDisable(true); // 비활성화
					});
				});
	}
	
	public void playFunc() {
		mediaPlay.play();
	}
	
	public void pauseFunc() {
		mediaPlay.pause();
	}
	
	public void stopFunc() {
		mediaPlay.stop();
	}
}
