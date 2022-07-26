package com.synacy.exercise;

public enum MessageType implements MessengerInterface {
	FAX{
		@Override
		public String toString() {
			return "FAX";
		}
	}, SMS {
		@Override
		public String toString() {
			return "SMS";
		}
	}, EMAIL {
		@Override
		public String toString() {
			return "EMAIL";
		}
	}, VOICE {
		@Override
		public String toString() {
			return "VOICE";
		}
	};
}
