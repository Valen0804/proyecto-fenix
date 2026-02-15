import java.util.List;

public class ProcesadorUsuarios {

    private static final int ROL_ADMIN = 1;
    private static final int ROL_INVITADO = 2;

    public String procesarLista(List<String> usuarios) {
        String admins = "";
        String invitados = "";

        for (String usuario : usuarios) {
            String[] partes = usuario.split(":");

            if (partes.length == 2) {
                String nombre = partes[0];
                int rol = Integer.parseInt(partes[1]);

                if (rol == ROL_ADMIN) {
                    admins += procesarAdmin(nombre);
                } else if (rol == ROL_INVITADO) {
                    invitados += procesarInvitado(nombre);
                }
            }
        }

        return "Admins: " + admins + " | Invitados: " + invitados;
    }

    private String procesarAdmin(String nombre) {
        return nombre + ",";
    }

    private String procesarInvitado(String nombre) {
        return nombre + ",";
    }
}
