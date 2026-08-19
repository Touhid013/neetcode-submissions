class TimeStampedValue {
    String value;
    int timestamp;

    public TimeStampedValue(String value, int timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }
}

class TimeMap {

    HashMap<String, ArrayList<TimeStampedValue>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }

        ArrayList<TimeStampedValue> list = map.get(key);

        list.add(new TimeStampedValue(value, timestamp));
    }

    public String get(String key, int timestamp) {

        if (!map.containsKey(key)) {
            return "";
        }

        ArrayList<TimeStampedValue> list = map.get(key);

        int left = 0;
        int right = list.size() - 1;
        int matchIndex = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            TimeStampedValue cur = list.get(mid);

            if (cur.timestamp <= timestamp) {

                matchIndex = mid;

                // Try to find a later valid timestamp
                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        if (matchIndex == -1) {
            return "";
        }

        return list.get(matchIndex).value;
    }
}