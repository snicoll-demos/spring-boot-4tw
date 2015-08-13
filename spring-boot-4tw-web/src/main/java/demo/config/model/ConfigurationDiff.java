package demo.config.model;

import java.util.LinkedList;
import java.util.List;

public class ConfigurationDiff {

	private String leftVersion;

	private String rightVersion;

	private final List<ConfigurationGroupDiff> groups = new LinkedList<>();

	public String getLeftVersion() {
		return leftVersion;
	}

	public void setLeftVersion(String leftVersion) {
		this.leftVersion = leftVersion;
	}

	public String getRightVersion() {
		return rightVersion;
	}

	public void setRightVersion(String rightVersion) {
		this.rightVersion = rightVersion;
	}

	public List<ConfigurationGroupDiff> getGroups() {
		return groups;
	}

}
