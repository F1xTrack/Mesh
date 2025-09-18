package com.vk.push.core.feature;

import defpackage.O90;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/vk/push/core/feature/Feature;", "", "", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "BooleanFeature", "IntFeature", "StringFeature", "Lcom/vk/push/core/feature/Feature$BooleanFeature;", "Lcom/vk/push/core/feature/Feature$IntFeature;", "Lcom/vk/push/core/feature/Feature$StringFeature;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class Feature {

    /* renamed from: a, reason: from kotlin metadata */
    public final String key;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vk/push/core/feature/Feature$BooleanFeature;", "Lcom/vk/push/core/feature/Feature;", "", "key", "", "defaultValue", "<init>", "(Ljava/lang/String;Z)V", "b", "Z", "getDefaultValue", "()Z", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class BooleanFeature extends Feature {

        /* renamed from: b, reason: from kotlin metadata */
        public final boolean defaultValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BooleanFeature(String str, boolean z) {
            super(str, null);
            O90.f(str, "key");
            this.defaultValue = z;
        }

        public final boolean getDefaultValue() {
            return this.defaultValue;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/vk/push/core/feature/Feature$IntFeature;", "Lcom/vk/push/core/feature/Feature;", "", "key", "", "defaultValue", "<init>", "(Ljava/lang/String;I)V", "b", "I", "getDefaultValue", "()I", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class IntFeature extends Feature {

        /* renamed from: b, reason: from kotlin metadata */
        public final int defaultValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntFeature(String str, int i) {
            super(str, null);
            O90.f(str, "key");
            this.defaultValue = i;
        }

        public final int getDefaultValue() {
            return this.defaultValue;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vk/push/core/feature/Feature$StringFeature;", "Lcom/vk/push/core/feature/Feature;", "", "key", "defaultValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getDefaultValue", "()Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class StringFeature extends Feature {

        /* renamed from: b, reason: from kotlin metadata */
        public final String defaultValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringFeature(String str, String str2) {
            super(str, null);
            O90.f(str, "key");
            O90.f(str2, "defaultValue");
            this.defaultValue = str2;
        }

        public final String getDefaultValue() {
            return this.defaultValue;
        }
    }

    public Feature(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.key = str;
    }

    public final String getKey() {
        return this.key;
    }
}
