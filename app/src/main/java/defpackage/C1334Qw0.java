package defpackage;

import com.facebook.react.animated.a;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;

/* renamed from: Qw0 */
/* loaded from: classes.dex */
public final class C1334Qw0 extends T4 {
    public final a e;
    public final JavaOnlyMap f;

    public C1334Qw0(ReadableMap readableMap, a aVar) {
        this.f = JavaOnlyMap.deepClone(readableMap);
        this.e = aVar;
    }

    @Override // defpackage.T4
    public final String c() {
        StringBuilder sb = new StringBuilder("ObjectAnimatedNode[");
        sb.append(this.d);
        sb.append("]: mConfig: ");
        JavaOnlyMap javaOnlyMap = this.f;
        sb.append(javaOnlyMap != null ? javaOnlyMap.toString() : "null");
        return sb.toString();
    }

    public final void e(String str, JavaOnlyMap javaOnlyMap) {
        JavaOnlyMap javaOnlyMap2 = this.f;
        ReadableType type = javaOnlyMap2.getType("value");
        if (type == ReadableType.Map) {
            javaOnlyMap.putMap(str, g(javaOnlyMap2.getMap("value")));
        } else {
            if (type != ReadableType.Array) {
                throw new IllegalArgumentException("Invalid value type for ObjectAnimatedNode");
            }
            javaOnlyMap.putArray(str, f(javaOnlyMap2.getArray("value")));
        }
    }

    public final JavaOnlyArray f(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (AbstractC1256Pw0.a[readableArray.getType(i).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(readableArray.getBoolean(i));
                    break;
                case 3:
                    javaOnlyArray.pushDouble(readableArray.getDouble(i));
                    break;
                case 4:
                    javaOnlyArray.pushString(readableArray.getString(i));
                    break;
                case 5:
                    ReadableMap map = readableArray.getMap(i);
                    if (!map.hasKey("nodeTag") || map.getType("nodeTag") != ReadableType.Number) {
                        javaOnlyArray.pushMap(g(readableArray.getMap(i)));
                        break;
                    } else {
                        T4 t4I = this.e.i(map.getInt("nodeTag"));
                        if (t4I == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (t4I instanceof C0823Kh1) {
                            C0823Kh1 c0823Kh1 = (C0823Kh1) t4I;
                            Object objE = c0823Kh1.e();
                            if (objE instanceof Integer) {
                                javaOnlyArray.pushInt(((Integer) objE).intValue());
                                break;
                            } else if (objE instanceof String) {
                                javaOnlyArray.pushString((String) objE);
                                break;
                            } else {
                                javaOnlyArray.pushDouble(c0823Kh1.f());
                                break;
                            }
                        } else if (t4I instanceof C0392Eu) {
                            javaOnlyArray.pushInt(((C0392Eu) t4I).e());
                            break;
                        } else {
                            break;
                        }
                    }
                    break;
                case 6:
                    javaOnlyArray.pushArray(f(readableArray.getArray(i)));
                    break;
            }
        }
        return javaOnlyArray;
    }

    public final JavaOnlyMap g(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (AbstractC1256Pw0.a[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(strNextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(strNextKey, readableMap.getBoolean(strNextKey));
                    break;
                case 3:
                    javaOnlyMap.putDouble(strNextKey, readableMap.getDouble(strNextKey));
                    break;
                case 4:
                    javaOnlyMap.putString(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 5:
                    ReadableMap map = readableMap.getMap(strNextKey);
                    if (map == null || !map.hasKey("nodeTag") || map.getType("nodeTag") != ReadableType.Number) {
                        javaOnlyMap.putMap(strNextKey, g(map));
                        break;
                    } else {
                        T4 t4I = this.e.i(map.getInt("nodeTag"));
                        if (t4I == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (!(t4I instanceof C0823Kh1)) {
                            if (!(t4I instanceof C0392Eu)) {
                                break;
                            } else {
                                javaOnlyMap.putInt(strNextKey, ((C0392Eu) t4I).e());
                                break;
                            }
                        } else {
                            C0823Kh1 c0823Kh1 = (C0823Kh1) t4I;
                            Object objE = c0823Kh1.e();
                            if (!(objE instanceof Integer)) {
                                if (!(objE instanceof String)) {
                                    javaOnlyMap.putDouble(strNextKey, c0823Kh1.f());
                                    break;
                                } else {
                                    javaOnlyMap.putString(strNextKey, (String) objE);
                                    break;
                                }
                            } else {
                                javaOnlyMap.putInt(strNextKey, ((Integer) objE).intValue());
                                break;
                            }
                        }
                    }
                case 6:
                    javaOnlyMap.putArray(strNextKey, f(readableMap.getArray(strNextKey)));
                    break;
            }
        }
        return javaOnlyMap;
    }
}
