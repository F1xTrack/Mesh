package com.p018my.tracker.personalize;

import com.p018my.tracker.personalize.PersonalizePlacementsRequest;
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
            return new PersonalizeItemRequest(this.f20217b, this.f20216a, this.f20219d, this.f20218c);
        }
    }

    public PersonalizeItemRequest(List list, String str, boolean z, Map map) {
        super(list, str, z, map);
    }

    public static PersonalizePlacementsRequest.Builder<PersonalizeItemRequest> newBuilder(String str) {
        return new Builder(str);
    }

    @Override // com.p018my.tracker.personalize.PersonalizeRequest
    /* renamed from: a */
    public String mo13634a() {
        return "/item";
    }
}
