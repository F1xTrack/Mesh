package io.appmetrica.analytics.profile;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC5007an;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class UserProfile {

    /* renamed from: a */
    private final List f33181a;

    public static class Builder {

        /* renamed from: a */
        private final LinkedList f33182a;

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder apply(UserProfileUpdate<? extends InterfaceC5007an> userProfileUpdate) {
            this.f33182a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f33182a, 0);
        }

        private Builder() {
            this.f33182a = new LinkedList();
        }
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i) {
        this(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder(0);
    }

    public List<UserProfileUpdate<? extends InterfaceC5007an>> getUserProfileUpdates() {
        return this.f33181a;
    }

    private UserProfile(LinkedList linkedList) {
        this.f33181a = CollectionUtils.unmodifiableListCopy(linkedList);
    }
}
