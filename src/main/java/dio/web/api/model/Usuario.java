package dio.web.api.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Usuario {

        private Integer id;
        private String login;
        private String password;


        public Usuario(int id, String login, String password) {
            this.id = id;
            this.login = login;
            this.password = password;
        }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

