package com.yandex.metrica.profile;

import com.yandex.metrica.impl.p022ob.InterfaceC2657Hf;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class UserProfile {

    /* renamed from: a */
    public final List f25511a;

    public static class Builder {

        /* renamed from: a */
        public final LinkedList f25512a = new LinkedList();

        public Builder apply(UserProfileUpdate<? extends InterfaceC2657Hf> userProfileUpdate) {
            this.f25512a.add(userProfileUpdate);
            return this;
        }

        public UserProfile build() {
            return new UserProfile(this.f25512a);
        }
    }

    public UserProfile(LinkedList linkedList) {
        this.f25511a = Collections.unmodifiableList(linkedList);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public List<UserProfileUpdate<? extends InterfaceC2657Hf>> getUserProfileUpdates() {
        return this.f25511a;
    }
}
