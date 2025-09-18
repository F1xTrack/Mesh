package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UnexpectedNativeTypeException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import java.util.List;
import p000.C11438vb1;
import p000.C7849Kh1;

/* loaded from: classes.dex */
class EventAnimationDriver implements RCTModernEventEmitter {
    String mEventName;
    private List<String> mEventPath;
    C7849Kh1 mValueNode;
    int mViewTag;

    public EventAnimationDriver(String str, int i, List<String> list, C7849Kh1 c7849Kh1) {
        this.mEventName = str;
        this.mViewTag = i;
        this.mEventPath = list;
        this.mValueNode = c7849Kh1;
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, WritableMap writableMap) throws NumberFormatException {
        receiveEvent(-1, i, str, writableMap);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i, int i2, String str, WritableMap writableMap) throws NumberFormatException {
        receiveEvent(i, i2, str, false, 0, writableMap, 2);
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveTouches(C11438vb1 c11438vb1) {
        throw new UnsupportedOperationException("receiveTouches is not support by native animated events");
    }

    @Override // com.facebook.react.uimanager.events.RCTModernEventEmitter
    public void receiveEvent(int i, int i2, String str, boolean z, int i3, WritableMap writableMap, int i4) throws NumberFormatException {
        ReadableArray array;
        ReadableMap map;
        if (writableMap != null) {
            ReadableArray array2 = null;
            for (int i5 = 0; i5 < this.mEventPath.size() - 1; i5++) {
                if (writableMap != null) {
                    String str2 = this.mEventPath.get(i5);
                    ReadableType type = writableMap.getType(str2);
                    if (type == ReadableType.Map) {
                        map = writableMap.getMap(str2);
                        array = null;
                    } else {
                        if (type != ReadableType.Array) {
                            throw new UnexpectedNativeTypeException("Unexpected type " + type + " for key '" + str2 + "'");
                        }
                        array = writableMap.getArray(str2);
                        map = null;
                    }
                    writableMap = map;
                    array2 = array;
                } else {
                    int i6 = Integer.parseInt(this.mEventPath.get(i5));
                    ReadableType type2 = array2.getType(i6);
                    if (type2 == ReadableType.Map) {
                        writableMap = array2.getMap(i6);
                        array2 = null;
                    } else {
                        if (type2 != ReadableType.Array) {
                            throw new UnexpectedNativeTypeException("Unexpected type " + type2 + " for index '" + i6 + "'");
                        }
                        array2 = array2.getArray(i6);
                        writableMap = null;
                    }
                }
            }
            String str3 = this.mEventPath.get(r2.size() - 1);
            if (writableMap != null) {
                this.mValueNode.f6259e = writableMap.getDouble(str3);
                return;
            } else {
                this.mValueNode.f6259e = array2.getDouble(Integer.parseInt(str3));
                return;
            }
        }
        throw new IllegalArgumentException("Native animated events must have event data.");
    }
}
