#ifndef BEACONMESSAGE_H__
#define BEACONMESSAGE_H__

enum {
	AM_RSSIMSG = 10
};

typedef nx_struct Beacon_msg{
	nx_uint16_t anchor_id;
	nx_int16_t rssi;
	nx_uint16_t coordinate_x;
	nx_uint16_t coordinate_y;
} Beacon_msg;

#endif //BEACONMESSAGE_H__