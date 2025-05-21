# Plank

![](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

Precise calisthenics REST API.

```mermaid
classDiagram 
    class Movement {
        String title
        boolean isometric

    }
    class Equipment {
        String title
        EquipmentType type
    }

    class MuscularGroup {
        String title
    }

    class Muscle {
        String title
    }
```