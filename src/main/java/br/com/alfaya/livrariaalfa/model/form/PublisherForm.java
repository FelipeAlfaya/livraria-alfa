package br.com.alfaya.livrariaalfa.model.form;

import br.com.alfaya.livrariaalfa.model.Publisher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PublisherForm {
  private String name;
  private String country;
  private String state;
  private Integer releaseYear;

  public Publisher build() {
    Publisher publisher = new Publisher();
    publisher.setName(name);
    publisher.setCountry(country);
    publisher.setState(state);
    publisher.setReleaseYear(releaseYear);

    return publisher;
  }
}
