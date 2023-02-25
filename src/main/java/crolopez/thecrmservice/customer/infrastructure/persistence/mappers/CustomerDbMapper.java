package crolopez.thecrmservice.customer.infrastructure.persistence.mappers;

import crolopez.thecrmservice.customer.domain.entities.CustomerEntity;
import crolopez.thecrmservice.shared.infrastructure.persistence.mappers.Mapper;
import crolopez.thecrmservice.customer.infrastructure.entities.CustomerDbEntity;
import org.springframework.stereotype.Component;

@Component
public class CustomerDbMapper implements Mapper<CustomerDbEntity, CustomerEntity> {

    @Override
    public CustomerEntity externalEntityToEntity(CustomerDbEntity customerDbEntity) {
        return CustomerEntity.builder()
                .id(customerDbEntity.getId())
                .name(customerDbEntity.getName())
                .surname(customerDbEntity.getSurname())
                .createdBy(customerDbEntity.getCreatedBy())
                .lastUpdateBy(customerDbEntity.getLastUpdateBy())
                .imageUrl(customerDbEntity.getImageUrl())
                .build();
    }

    @Override
    public CustomerDbEntity entityToExternalEntity(CustomerEntity customerEntity) {
        return CustomerDbEntity.builder()
                .id(customerEntity.getId())
                .name(customerEntity.getName())
                .surname(customerEntity.getSurname())
                .createdBy(customerEntity.getCreatedBy())
                .lastUpdateBy(customerEntity.getLastUpdateBy())
                .imageUrl(customerEntity.getImageUrl())
                .build();
    }
}