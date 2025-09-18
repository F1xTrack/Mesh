package com.huawei.hms.common.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC11153tN0;

/* loaded from: classes.dex */
public final class Objects {

    public static final class ToStringHelper {

        /* renamed from: a */
        private final List<String> f18957a;

        /* renamed from: b */
        private final Object f18958b;

        public /* synthetic */ ToStringHelper(Object obj, C2069a c2069a) {
            this(obj);
        }

        public final ToStringHelper add(String str, Object obj) {
            String str2 = (String) Preconditions.checkNotNull(str);
            String strValueOf = String.valueOf(obj);
            this.f18957a.add(AbstractC11153tN0.m24914z(new StringBuilder(strValueOf.length() + str2.length() + 1), str2, ContainerUtils.KEY_VALUE_DELIMITER, strValueOf));
            return this;
        }

        public final String toString() {
            String simpleName = this.f18958b.getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(100);
            sb.append(simpleName);
            sb.append('{');
            int size = this.f18957a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f18957a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private ToStringHelper(Object obj) {
            this.f18958b = Preconditions.checkNotNull(obj);
            this.f18957a = new ArrayList();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean isNull(Object... objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }
}
