package twitch4j.common.enums;

public enum VideoType {
	UPLOAD,
	ARCHIVE,
	HIGHLIGHT,
	ALL;

	public static VideoType of(String type) {
		for (VideoType videoType : values()) {
			if (videoType.name().equalsIgnoreCase(type)) {
				return videoType;
			}
		}

		return ARCHIVE;
	}
}
