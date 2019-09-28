package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArmyBattalionProblem {

	public static void main(String[] args) {
		String[] input1 = { "1#2", "2#3", "1#11", "3#11", "4#11", "4#5", "5#6", "5#7", "6#7", "4#12", "8#12", "9#12",
				"8#10", "9#10", "8#9" };
		//String[] input1 = { "1#2", "1#3", "1#4", "1#5", "2#4", "2#5", "3#4"};
		int ans = maxno_city(input1);
		System.out.println(String.valueOf(ans));
	}

	public static int maxno_city(String[] input1) {
		int index = 0;
		try {
			List<CityMapping> cityMapList = new ArrayList<>();
			for (String input : input1) {
				String[] splitValue = input.split("#");
				CityMapping cm = new CityMapping();
				cm.setIndex(index++);
				cm.setFrom(Integer.parseInt(splitValue[0]));
				cm.setTo(Integer.parseInt(splitValue[1]));
				cityMapList.add(cm);
			}

			Set<String> cities = new HashSet<String>();
			for (int i = 0; i < cityMapList.size(); i++) {
				List<Integer> visited = new ArrayList<Integer>();
				String city = new String();

				Set<String> partitalCities = calMaxCities(0, i, cityMapList, cities, city, visited);
				cities.addAll(partitalCities);
			}

			int max = 0;
			for (String maxCity : cities) {
				String[] maxCities = maxCity.split("#");
				int maxCityLength = maxCities.length;
				if (max < maxCityLength) {
					max = maxCityLength;
				}
			}
			return max;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;

	}

	private static Set<String> calMaxCities(int prevCity, int index, List<CityMapping> cityMappings, Set<String> cities,
			String city, List<Integer> visited) {

		if (visited.isEmpty()) {
			if (cityMappings.get(index).getTo() != cityMappings.get(index).getFrom()) {
				city = cityMappings.get(index).getFrom() + "#" + cityMappings.get(index).getTo();
				visited.add(cityMappings.get(index).getFrom());
				visited.add(cityMappings.get(index).getTo());
				prevCity = cityMappings.get(index).getTo();
			} else {
				city = cityMappings.get(index).getFrom() + "";
				visited.add(cityMappings.get(index).getFrom());
				prevCity = cityMappings.get(index).getFrom();
			}
		} else {
			if (prevCity == cityMappings.get(index).getFrom()) {
				city = city + "#" + cityMappings.get(index).getTo();
				visited.add(cityMappings.get(index).getTo());
				prevCity = cityMappings.get(index).getTo();
			} else if (prevCity == cityMappings.get(index).getTo()) {
				city = city + "#" + cityMappings.get(index).getFrom();
				visited.add(cityMappings.get(index).getFrom());
				prevCity = cityMappings.get(index).getFrom();
			}
		}
		List<CityMapping> pathsFromCity = findPathFromCity(prevCity, cityMappings, visited);
		for (CityMapping cityMapping : pathsFromCity) {
			calMaxCities(prevCity, cityMapping.getIndex(), cityMappings, cities, city, visited);
		}
		cities.add(city);
		visited = new ArrayList<Integer>();
		return cities;
	}

	private static List<CityMapping> findPathFromCity(int prevCity, List<CityMapping> cityMappings,
			List<Integer> visited) {
		List<CityMapping> pathsFromCity = new ArrayList<CityMapping>();
		for (CityMapping cityMapping : cityMappings) {
			if (prevCity == cityMapping.getFrom() && !visited.contains(cityMapping.getTo())) {
				pathsFromCity.add(cityMapping);
			} else if (prevCity == cityMapping.getTo() && !visited.contains(cityMapping.getFrom())) {
				pathsFromCity.add(cityMapping);
			}
		}
		return pathsFromCity;
	}

	private static class CityMapping {
		private int index;
		private int from;
		private int to;

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public int getFrom() {
			return from;
		}

		public void setFrom(int from) {
			this.from = from;
		}

		public int getTo() {
			return to;
		}

		public void setTo(int to) {
			this.to = to;
		}

		@Override
		public String toString() {
			return getFrom() + "#" + getTo();
		}
	}
}
