package com.gaurav.boot.courseapidata.topic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="topic_db")
public class Topic{
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id")
		private Integer id;
		private String name;
		private String description;
		
		public Topic() {
			
		}
		
		public Topic(Integer id, String name, String description) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
}
