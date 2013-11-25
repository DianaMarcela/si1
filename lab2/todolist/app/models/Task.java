package models;

import java.util.*;

import play.data.validation.Constraints.Required;

public class Task {
    
  private Long id;
  
  @Required
  private String label;
  
  private static List<Task> all() {
    return new ArrayList<Task>();
  }
  
  private static void create(Task task) {
  }
  
  private static void delete(Long id) {
  }
    
}
