//package Year2019.Sept27;
//
//public class robotSim {
//
//    public static void main(String[] args) {
//        int[] a = {-2,-1,8,9,6};
//        int[][] ob = {{-1,3},{0,1},{-1,5},{-2,-4},{5,4},{-2,-3},{5,-1},{1,-1},{5,5},{5,2}};
//        System.out.println(RobotSim(a, ob));
//    }
//
//    public static int RobotSim(int[] commands, int[][] obstacles) {
//        int x = 0, y = 0;
//        int direction = 0;
//        for (int i = 0; i < commands.length; i++) {
//            if (commands[i] == -1) {
//                if (direction == 1 || direction == 0 || direction == 2) {
//                    direction -= 1;
//                } else if (direction == -1) {
//                    direction = 2;
//                }
//
//            } else if (commands[i] == -2) {
//                if (direction == -1 || direction == 0 || direction == 1) {
//                    direction += 1;
//                } else if (direction == 2) {
//                    direction = -1;
//                }
//
//            } else {
//                if (obstacles.length > 0) {
//                    boolean canGo = true;
//                    a:for (int j = 0; j < obstacles.length; j++) {
//                        if (canGo ==X){
//                        int ox = obstacles[j][0];
//                        int oy = obstacles[j][1];
//                        switch (direction) {
//                            //朝上
//                            case 0:
//                                //如果可能会碰到
//                                if (x == ox) {
//                                    //如果碰到了
//                                    if (y + commands[i] >= oy) {
//                                        y = oy - 1;
//                                        break a;
//                                    } else {
//                                        y += commands[i];
//                                        break a;
//                                    }
//                                } else {
//                                    y += commands[i];
//                                    break a;
//                                }
////                                break;
//                            //朝左
//                            case 1:
//                                //如果可能会碰到
//                                if (y == oy) {
//                                    //如果碰到了
//                                    if (x - commands[i] <= ox) {
//                                        x = ox + 1;
//                                        break a;
//                                    } else {
//                                        x -= commands[i];
//                                        break a;
//                                    }
//                                } else {
//                                    x -= commands[i];
//                                    break a;
//                                }
////                                break;
//                            //朝右
//                            case -1:
//                                //如果可能会碰到
//                                if (y == oy) {
//                                    //如果碰到了
//                                    if (x + commands[i] >= ox) {
//                                        x = ox - 1;
//                                        break a;
//                                    } else {
//                                        x += commands[i];
//                                        break a;
//                                    }
//                                } else {
//                                    x += commands[i];
//                                    break a;
//                                }
////                                break;
//                            //朝下
//                            case 2:
//                                //如果可能会碰到
//                                if (x == ox) {
//                                    //如果碰到了
//                                    if (y - commands[i] <= oy) {
//                                        y = oy + 1;
//                                        break a;
//                                    } else {
//                                        y -= commands[i];
//                                        break a;
//                                    }
//                                } else {
//                                    y -= commands[i];
//                                    break a;
//                                }
////                                break;
//
//                            default:
//
//                                break;
//                        }
//                    }
//                } else {
//                    switch (direction) {
//                        //朝上
//                        case 0:
//                            y += commands[i];
//                            break;
//                        //朝左
//                        case 1:
//                            x -= commands[i];
//                            break;
//                        //朝右
//                        case -1:
//                            x += commands[i];
//                            break;
//                        //朝下
//                        case 2:
//                            y -= commands[i];
//                            break;
//
//                        default:
//
//                            break;
//                    }
//
//                }
//            }
//
//        }
//        System.out.println(x + "   "+ y);
//        return x * x + y * y;
//    }
//
//}
