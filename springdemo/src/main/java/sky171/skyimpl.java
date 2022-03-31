package sky171;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import Sky.skypojo;

@Service
public class skyimpl implements skylimits {
	private Set<skypojo>skys= new HashSet<skypojo>();
	
	public void add(skypojo sky) {
		skys.add(sky);
		
		
	}
	


	@Override
	public Set<skypojo> sky() {
		// TODO Auto-generated method stub
		return skys;
	}

}
