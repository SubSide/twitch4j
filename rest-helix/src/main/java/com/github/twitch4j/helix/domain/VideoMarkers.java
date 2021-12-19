package com.github.twitch4j.helix.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

/**
 * Model representing a stream.
 * <p>
 * A stream is a channel, that is currently streaming live.
 */
@Data
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor
public class VideoMarkers {

    /**
     * Stream ID.
     */
    @NonNull
    private String videoId;

    /**
     * Markers
     */
    @NonNull
    private List<VideoMarker> markers;

}
