package com.core.classes;

import java.time.LocalDate;

public class TaskManager {
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private TaskStatus status;
	private boolean active;
	private static int idGenerator;
	
	public TaskManager(String taskName, String description, LocalDate taskDate) {
		super();
		this.taskId=++idGenerator;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status=TaskStatus.PENDING;
		this.active=true;
	}

	public int getTaskId() {
		return taskId;
	}

	public String getTaskName() {
		return taskName;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public TaskStatus getStatus() {
		return status;
	}

	public void setStatus(TaskStatus status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "TaskManager [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description
				+ ", taskDate=" + taskDate + ", status=" + status + ", active=" + active + "]";
	}


	
	
}
