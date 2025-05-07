public class BulletPool extends MemoryPool<Bullet>{
    @Override
    public Bullet allocate() {
        return new Bullet();
    }
}
