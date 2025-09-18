package com.p018my.tracker.personalize;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class PersonalizePlacementsRequest extends PersonalizeRequest<List<PersonalizePlacement>> {

    /* renamed from: a */
    private final Map f20215a = m13635d();
    public final Map<String, String> customParams;
    public final List<String> placements;
    public final boolean reset;
    public final String userId;

    public static abstract class Builder<T extends PersonalizePlacementsRequest> {

        /* renamed from: a */
        final String f20216a;

        /* renamed from: b */
        List f20217b;

        /* renamed from: c */
        Map f20218c;

        /* renamed from: d */
        boolean f20219d = true;

        public Builder(String str) {
            this.f20216a = str;
        }

        public abstract T build();

        public Builder<T> withCustomParams(Map<String, String> map) {
            if (map != null) {
                this.f20218c = new HashMap(map);
            } else {
                this.f20218c = null;
            }
            return this;
        }

        public Builder<T> withPlacements(List<String> list) {
            if (list != null) {
                this.f20217b = new ArrayList(list);
            } else {
                this.f20217b = null;
            }
            return this;
        }

        public Builder<T> withReset(boolean z) {
            this.f20219d = z;
            return this;
        }
    }

    public PersonalizePlacementsRequest(List list, String str, boolean z, Map map) {
        this.placements = list;
        this.userId = str;
        this.reset = z;
        this.customParams = map;
    }

    /* renamed from: d */
    private Map m13635d() {
        HashMap map = new HashMap();
        Map<String, String> map2 = this.customParams;
        if (map2 != null && !map2.isEmpty()) {
            this.customParams.remove("custom_user_id");
            this.customParams.remove("placement_ids");
            this.customParams.remove("reset");
            this.customParams.remove("flat");
            for (Map.Entry<String, String> entry : this.customParams.entrySet()) {
                map.put(entry.getKey(), Collections.singletonList(entry.getValue()));
            }
        }
        List<String> list = this.placements;
        if (list != null && !list.isEmpty()) {
            map.put("placement_ids", this.placements);
        }
        if (!TextUtils.isEmpty(this.userId)) {
            map.put("custom_user_id", Collections.singletonList(this.userId));
        }
        map.put("reset", Collections.singletonList(this.reset ? "1" : "0"));
        map.put("flat", Collections.singletonList("1"));
        return map;
    }

    @Override // com.p018my.tracker.personalize.PersonalizeRequest
    /* renamed from: b */
    public final Map mo13636b() {
        return this.f20215a;
    }

    @Override // com.p018my.tracker.personalize.PersonalizeRequest
    /* renamed from: c */
    public final AbstractC2397b mo13637c() {
        return new C2399d();
    }
}
