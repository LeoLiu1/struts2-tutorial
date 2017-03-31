package basic_struts.register.service;

import java.util.ArrayList;
import java.util.List;

import basic_struts.register.model.State;

public class StateServiceImp implements StateService {

	@Override
	public List<State> getStates() {
		List<State> states = new ArrayList<State>();
		states.add(new State("皖", "安徽"));
		states.add(new State("苏", "江苏"));
		states.add(new State("浙", "浙江"));
		states.add(new State("沪", "上海"));
		states.add(new State("赣", "江西"));
		states.add(new State("粤", "广东"));
		return states;
	}

}
