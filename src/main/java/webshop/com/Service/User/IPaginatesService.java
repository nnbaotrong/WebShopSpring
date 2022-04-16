package webshop.com.Service.User;

import org.springframework.stereotype.Service;

import webshop.com.Dto.PaginatesDto;

@Service
public interface IPaginatesService {

	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage);
}
