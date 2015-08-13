package demo.config.model;

import demo.config.diff.ConfigDiffType;

import org.springframework.boot.configurationmetadata.ConfigurationMetadataProperty;

public class ConfigurationPropertyDiff {

	private String id;

	private ConfigDiffType diffType;

	private ConfigurationMetadataProperty left;

	private ConfigurationMetadataProperty right;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConfigDiffType getDiffType() {
		return diffType;
	}

	public void setDiffType(ConfigDiffType diffType) {
		this.diffType = diffType;
	}

	public ConfigurationMetadataProperty getLeft() {
		return left;
	}

	public void setLeft(ConfigurationMetadataProperty left) {
		this.left = left;
	}

	public ConfigurationMetadataProperty getRight() {
		return right;
	}

	public void setRight(ConfigurationMetadataProperty right) {
		this.right = right;
	}

}
