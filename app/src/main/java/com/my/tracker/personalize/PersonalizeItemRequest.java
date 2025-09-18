package com.my.tracker.personalize;

import com.my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PersonalizeItemRequest extends PersonalizePlacementsRequest {

    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeItemRequest> {
        public Builder(String str) {
            super(str);
        }

        @Override // com.my.tracker.personalize.PersonalizePlacementsRequest.Builder
        public PersonalizeItemRequest build() {
            return new PersonalizeItemRequest(this.b, this.a, this.d, this.c);
        }
    }

    public PersonalizeItemRequest(List list, String str, boolean z, Map map) {
        super(list, str, z, map);
    }

    public static PersonalizePlacementsRequest.Builder<PersonalizeItemRequest> newBuilder(String str) {
        return new Builder(str);
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    public String a() {
        return "/item";
    }
}
