package de.kemomi.spotifysync;

import javafx.stage.Stage;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 *
 */
@Getter
class StageReadyEvent extends ApplicationEvent {

    private final Stage primaryStage;

    public StageReadyEvent(Stage primaryStage) {
        super(primaryStage);
        this.primaryStage = primaryStage;
    }
}
