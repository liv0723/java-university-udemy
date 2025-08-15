package udemy.university.section15.fit_zone.sevice;

import udemy.university.section15.fit_zone.domain.Client;

import java.util.List;

public interface IClientDAO {
    public List<Client> listClient();
    public boolean searchClient(Client client);
    public boolean InsertClient(Client client);
    public boolean updateClient(Client client);
    public boolean deleteClient(Client client);
}
