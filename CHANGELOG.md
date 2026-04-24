# Changelog

All notable changes to this project will be documented in this file.

## 2026.04.24

### Added

- Designed a TaskManager component
- Designed a PasswordManager component
- Designed a WorkoutTracker component



## 2026.04.24

### Added

- Designed a proof of concept for TaskManager component

### Updated

- Changed design to focus on TaskManager as the main component moving forward
- Added a Java proof-of-concept with task adding, removing, checking, counting, clearing, and a main method demo


## 2026.04.24

### Added

- Designed kernel and enhanced interfaces for TaskManager component

### Updated

- Improved design by separating kernel and secondary methods
- Added formal method contracts using OSU discipline

### Component Hierarchy Diagram

TaskManager (Enhanced Interface)
        ↑
TaskManagerKernel (Kernel Interface)
        ↑
Standard<TaskManager>


## 2026.04.24

### Added

- Designed abstract class for TaskManager component

### Updated

- Implemented all secondary methods using kernel methods only
- Replaced temporary structures with newInstance() and transferFrom()
- Added toString() and equals()

## 2026.04.24

### Added

- Designed kernel implementation for TaskManager component

### Updated

- Selected Queue<String> as the representation
- Added convention and correspondence for TaskManager1L
- Implemented kernel methods and Standard methods